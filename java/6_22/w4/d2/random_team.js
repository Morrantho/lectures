// JP Pacheco
// Ray Yazdi

let randf=(min,max)=>min+Math.random()*(max-min);
let randi=(min,max)=>randf(min,max)|0;

let teams=
[
	"Druids",
	"Fighters",
	"Monks",
	"Paladins"
];

let ray=teams[ randi(0,4) ];
console.log(ray);

let jp=teams[ randi(0,4) ];
console.log(jp);