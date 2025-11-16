
function calcularMediaSimples() {

    
    let N1 = Number(document.getElementById("N1").value);
    let N2 = Number(document.getElementById("N2").value);
    let res = document.getElementById("res");

    let soma = N1 + N2;
    let media = soma / 2;


    if (media >= 7) {
        res.innerText = "Aprovado✅";
        res.style.color = "green";
    } else {
        res.innerText = "Reprovado❌";
        res.style.color = "red";
    }
}