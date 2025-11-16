
function podeDirigir() {

     // pegar valor do input e converter para número
    let idade = Number(document.getElementById("idade").value);
    let res = document.getElementById("res");

    if (idade >= 18) {
        res.innerText = "Pode ter habilitação✅";
        res.style.color = "green";      // cor verde
    } else {
        res.innerText = "Não pode ter habilitação❌";
        res.style.color = "red";        // cor vermelha
    }
}