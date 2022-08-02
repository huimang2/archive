function combination(arr, r = 0) {
    
    const output = [];
    const length = arr.length;

    for(let i = 0; i < 2**length; i++) {
        const cur = [];
        for (let j = 0; j < length; j++) {
            if (i & (1 << j)) cur.push(arr[j]);
        }
        if(!r || cur.length === r) output.push(cur);
    }
    return output;
}

console.log(combination(["A","B","C"]));