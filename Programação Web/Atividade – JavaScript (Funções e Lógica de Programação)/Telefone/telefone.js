function formatarTelefone() {

    let res = document.getElementById("res");
    let tel = document.getElementById("telefone").value; // pega a string digitada

    let parte1 = tel.slice(0, 4);  
    let parte2 = tel.slice(4, 8);

    let formatado = parte1 + "-" + parte2;

    res.innerText = formatado;
}
