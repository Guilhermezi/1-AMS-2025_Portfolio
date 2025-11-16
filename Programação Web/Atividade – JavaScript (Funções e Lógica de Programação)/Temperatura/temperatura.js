let temperatura = 0;

const input = document.getElementById("temperatura");

input.addEventListener("input", () => {

    let valor = input.value.replace(/\D/g, ""); // só números

    temperatura = Number(valor); 

    // formatação visual
    input.value = "°C " + temperatura;
});


function checarTemperatura() {

    let res = document.getElementById("res");

    if (temperatura < 10) {
        res.innerText = "Alerta de Frio";
        res.style.color = "blue";
    }
    else if (temperatura >= 10 && temperatura <= 25) {
        res.innerText = "Temperatura ideal";
        res.style.color = "goldenrod";
    }
    else {
        res.innerText = "Alerta de Calor 🔥";
        res.style.color = "red";
    }
}
