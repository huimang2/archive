function permutation(arr, n = arr.length, r = n, depth = 0, visited = [], output = [], result = []) {
    
    if(depth === r) {
        result.push(output.slice());
        return;
    }

    for(let i = 0; i < n; i++) {
        if(!visited[i]) {
            visited[i] = true;
            output[depth] = arr[i];
            permutation(arr, n, r, depth + 1, visited, output, result);
            visited[i] = false;
        }  
    }

    if (depth === 0) return result;
}

console.log(permutation(["A", "B", "C"]));