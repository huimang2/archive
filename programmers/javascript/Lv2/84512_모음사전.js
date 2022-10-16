// https://school.programmers.co.kr/learn/courses/30/lessons/84512

function solution(word) {
    
    const arr = "AEIOU";
    const length = arr.length;

    let count = 0;

    (function perm(searchWord, word = "" , depth = 0) {

        if(word === searchWord || depth === length) return word;

        for(let i = 0; i < length; i++) {
            count++;
            if(perm(searchWord, word + arr[i], depth + 1) === searchWord) return searchWord;
        }

        return word;
    })(word);

    return count;
}

// 다른 알고리즘(추천)

function solution(words) {
    return words.split('').reduce((r, c, i) => r + [781, 156, 31, 6, 1][i] * ['A', 'E', 'I', 'O', 'U'].indexOf(c) + 1, 0);
}