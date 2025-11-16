function tipoTriangulo() {

    let num1 = Number(document.getElementById("lado1").value);
    let num2 = Number(document.getElementById("lado2").value);
    let num3 = Number(document.getElementById("lado3").value);
    let res = document.getElementById("res");

    // EQUILÁTERO → todos iguais
    if (num1 === num2 && num1 === num3) {
        res.innerText = "Equilátero → todos iguais";
        res.style.color = "goldenrod";
    }

    // ISÓSCELES → dois iguais
    else if (
        (num1 === num2 && num1 !== num3) ||
        (num1 === num3 && num1 !== num2) ||
        (num2 === num3 && num2 !== num1)
    ) {
        res.innerText = "Isósceles → dois iguais";
        res.style.color = "orange";
    }

    // ESCALENO → nenhum igual
    else if (num1 !== num2 && num1 !== num3 && num2 !== num3) {
        res.innerText = "Escaleno → nenhum lado igual";
        res.style.color = "green";
    }

    // Se der qualquer erro
    else {
        res.innerText = "Valores inválidos ❌";
        res.style.color = "red";
    }
}