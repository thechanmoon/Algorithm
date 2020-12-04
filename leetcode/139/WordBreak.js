var wordBreak = function(s, A) {
    const n = s.length;
    const D = new Array(n + 1);
    D[0] = true;
    for (let i = 1; i <= n; ++i)
        for (let a of A)
            if (D[i - a.length] && s.substring(i - a.length, i) === a) {
                D[i] = true;
                break;
            }
    return !!D[n];
};

console.log('','');