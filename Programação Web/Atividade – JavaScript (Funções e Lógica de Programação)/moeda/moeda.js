function ClassificarMoeda() {

    let res = document.getElementById("res");
    res.style.color = "black";

    if (valorNumerico === 0.01) {
        res.innerText = "Um centavo";
    }
    else if (valorNumerico === 0.05) {
        res.innerText = "Cinco centavos";
    }
    else if (valorNumerico === 0.10) {
        res.innerText = "Dez centavos";
    }
    else if (valorNumerico === 0.25) {
        res.innerText = "Vinte e cinco centavos";
    }
    else if (valorNumerico === 0.50) {
        res.innerText = "Cinquenta centavos";
    }
    else if (valorNumerico === 1.00) {
        res.innerText = "Um real";
    }
    else {
        res.innerText = "O número digitado não corresponde a uma moeda ❌";
        res.style.color = "red";
    }
}

const input = document.getElementById("moeda");

// campo oculto para guardar o valor numérico
let valorNumerico = 0;

input.addEventListener("input", () => {

    let valor = input.value.replace(/\D/g, ""); // só números

    valorNumerico = Number(valor) / 100;        // ex: 10 → 0.10

    // formatação visual
    input.value = "R$ " + valorNumerico.toFixed(2).replace(".", ",");
});
