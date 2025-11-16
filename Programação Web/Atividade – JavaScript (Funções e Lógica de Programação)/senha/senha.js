function senhaForte() {

    let senha = document.getElementById("senha").value; // SENHA É TEXTO
    let res = document.getElementById("res");

    if (senha.length > 8 && senha !== "12345678") {
        res.innerText = "Sua senha é segura ✔";
        res.style.color = "green";
    } else {
        res.innerText = "Sua senha é fraca ❌";
        res.style.color = "red";
    }
}