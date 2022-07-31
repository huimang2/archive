function solution(rectangles) {

    const length = rectangles.length;

    const xDataArray = new Array(length * 2);
    const yDataSet = new Set();

    for(let i = 0; i < length; i++)
    {
        xDataArray[2*i] = new DataX(rectangles[i][0], rectangles[i][1], rectangles[i][3], true);
        xDataArray[2*i + 1] = new DataX(rectangles[i][2], rectangles[i][1], rectangles[i][3], false);
        yDataSet.add(rectangles[i][1]);
        yDataSet.add(rectangles[i][3]);
    }

    const yDataArray = [...yDataSet];

    xDataArray.sort((a, b) => a.x - b.x);
    yDataArray.sort((a, b) => a - b);

    let sgTree = new SegmentTree(yDataArray);

    let area = 0;
    let width = 0;

    for(let i = 0; i < length * 2; i++){
        
        if(i>0) width = xDataArray[i].x - xDataArray[i-1].x;
        area += width * sgTree.tree[1].sum;

        sgTree.update(sgTree.index.get(xDataArray[i].y1), sgTree.index.get(xDataArray[i].y2)-1, 0, yDataArray.length - 1, 1, xDataArray[i].count);
    }

    return area;
}

class DataX
{
    x = 0;
    y1 = 0;
    y2 = 0;
    count = true;

    constructor(x, y1, y2, count)
    {
        this.x = x | 0;
        this.y1 = y1 | 0;
        this.y2 = y2 | 0;
        this.count = !!(count | false);
    }
}

class TreeData
{
    count = 0;
    sum = 0;
}

class SegmentTree {

    constructor(data) {

        this.data = data;
        
        this.index = new Map();
        data.forEach((el, idx) => this.index.set(el, idx));

        const h = Math.ceil(Math.log(data.length) / Math.log(2)) + 1;
        this.tree = Array.from({length: Math.pow(2, h)}, () => new TreeData());
    }

    update(left, right, start, end, node, count) {
        
        if (left > end || right < start) return;

        if (left <= start && end <= right) this.tree[node].count += count ? 1 : -1;
        else {
            const mid = (start + end) / 2 | 0;
            this.update(left, right, start, mid, node * 2, count);
            this.update(left, right, mid + 1, end, node * 2 + 1, count);
        }

        if(this.tree[node].count) this.tree[node].sum = this.data[end+1] - this.data[start];
        else {
            if (start === end) this.tree[node].sum = 0;
            else this.tree[node].sum = this.tree[node * 2].sum + this.tree[node * 2 + 1].sum;
        }
    }
}

console.log(solution([[2,2,4,4],[2,2,4,4],[2,2,5,5]]));
