function verificarNumero() {
    const num = document.getElementById("numero").value;
    const resultado = document.getElementById("resultado");

    // Converter para número inteiro
    const numeroInt = parseInt(num);

    if (numeroInt % 2 === 0) {
        resultado.className = "par";
        resultado.innerHTML = `${numeroInt} é PAR `;
    } else {
        resultado.className = "impar";
        resultado.innerHTML = `${numeroInt} é ÍMPAR`;
    }
}