function calcularIdade() {
    const dataNascimento = new Date(document.getElementById('anoNascimento').value);
    const resultado = document.getElementById('resultado');
    const hoje = new Date();

    // Cálculo da idade
    let idade = hoje.getFullYear() - dataNascimento.getFullYear();
    const mes = hoje.getMonth() - dataNascimento.getMonth();

    if (mes < 0 || (mes === 0 && hoje.getDate() < dataNascimento.getDate())) {
        idade--;
    }

    resultado.innerHTML = `Sua idade é: <span style="color: #2ecc71;">${idade} anos</span>`;
}
