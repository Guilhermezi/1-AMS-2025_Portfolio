function gerarNomeCompleto() {

    let nome = document.getElementById("nome").value;
    let sobrenome = document.getElementById("sobrenome").value;
    let res = document.getElementById("res");

    let nomeCompleto = nome + " " + sobrenome;

    res.innerText = nomeCompleto;
}
