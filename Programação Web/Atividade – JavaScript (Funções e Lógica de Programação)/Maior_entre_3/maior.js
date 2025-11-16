function encontrarMaiorEntreTres() {

    let num1 = Number(document.getElementById("numero1").value);
    let num2 = Number(document.getElementById("numero2").value);
    let num3 = Number(document.getElementById("numero3").value);
    let res = document.getElementById("res");

    if (num1 > num2 && num1 > num3) {
        res.innerText = `O maior número é: ${num1}`;
        res.style.color = "green";
    } 
    else if (num2 > num1 && num2 > num3) {
        res.innerText = `O maior número é: ${num2}`;
        res.style.color = "green";
    }
    else if (num3 > num1 && num3 > num2) {
        res.innerText = `O maior número é: ${num3}`;
        res.style.color = "green";
    }
    else {
        res.innerText = "Os números são iguais ou inválidos ❌";
        res.style.color = "red";
    }
}