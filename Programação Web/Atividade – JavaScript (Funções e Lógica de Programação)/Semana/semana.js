
function nomeDoDia() {

    const semana = Number(document.getElementById("semana").value);
    const res = document.getElementById("res");

    switch (semana) {
        case 1:
            res.innerText = "Domingo";
            res.style.color = "goldenrod";
            break;
        case 2:
            res.innerText = "Segunda";
            res.style.color = "red";
            break;
        case 3:
            res.innerText = "Terça";
            res.style.color = "red";
            break;
        case 4:
            res.innerText = "Quarta";
            res.style.color = "goldenrod";
            break;
        case 5:
            res.innerText = "Quinta";
            res.style.color = "orange";
            break;
        case 6:
            res.innerText = "Sexta";
            res.style.color = "green";
            break;
        case 7:
            res.innerText = "Sabado";
            res.style.color = "green";
            break;
        default:
            res.innerText = "O número digitado não corresponde a nenhum dia da semana ❌";
            res.style.color = "red";
            break;
    }

    
}