// https://school.programmers.co.kr/learn/courses/30/lessons/42839

function solution(numbers) {
    
    numberArr = numbers.split('');
    numberArr.sort((a,b)=>b-a);

    const max = numberArr.join('') | 0;
    const primes = Array(max+1).fill(true);

    let count = 0;
    
    primes[0] = primes[1] = 0;
    
    for(let i = 2; i**2 <= max; i++) {
        if(primes[i]) {
            for(let j = 2 * i; j <= max; j += i) {
                primes[j] = false;
            }
        }
    }

    perm([], numberArr);
    
    return count;

    function perm(arr, rest) {

        rest.forEach((e, i, o) => {

            const output = arr.slice();
            const rest = o.slice();
            
            output.push(e);
            rest.splice(i,1);

            const num = output.join('')|0;

            if(primes[num]) {
                count++;
                primes[num] = false;
            }

            if(rest.length === 0) return;
            
            perm(output, rest);
        });
    }
}

console.log(solution("17"));