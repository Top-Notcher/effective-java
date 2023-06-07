'use strict';

var a = {
    'name' : 'a',
    'age' : '20'
};

Object.freeze(a);   // 밑과 같은 방법으로도 변경 X

delete a.name;
a.nick = ["b"];