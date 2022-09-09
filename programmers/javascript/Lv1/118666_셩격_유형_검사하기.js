// https://programmers.co.kr/learn/courses/30/lessons/92334

function solution(survey, choices) {

    const indicators = ["R", "T", "C", "F", "J", "M", "A", "N"];
    const points = Array(indicators.length).fill(0);

    survey.forEach((el, i) => points[indicators.indexOf(choices[i] <= 4 ? el[0] : el[1])] += Math.abs(choices[i] - 4))
    return Array.from({length: 4}).map((_, i) => points[2 * i] >= points[2 * i + 1] ? indicators[2 * i] : indicators[2 * i + 1]).join('');
}