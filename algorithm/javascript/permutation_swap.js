function permutation(arr, n = arr.length, r = n, depth = 0, output = []) {
    
    if(depth === r) {
        output.push(arr.slice());
        return;
    }

    for(let i = depth; i < n; i++) {
        swap(arr, depth, i);
        permutation(arr, n, r, depth + 1, output);
        swap(arr, depth, i);
    }

    if (depth === 0) return output;

    function swap(arr, depth, i) {
        const temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }
}

console.log(permutation(["A", "B", "C"]));