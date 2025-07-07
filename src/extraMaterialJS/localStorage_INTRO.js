//CONTENIDO EXTRA - TRABAJANDO CON LOCALSTORAGE :)

//1.- FUNCIÓN GUARDAR --> guardar()
function guardar(){
    // Leer los datos del formulario (USA getElementById)
    const campo1 = document.getElementById("campo1").value;
    const campo2 = document.getElementById("campo2").value;
    const indice = document.getElementById("indice").value;

    //LEER EL ARREGLO DEL LOCAL STORAGE
    let lista = JSON.parse(localStorage.getItem("miLista")) || []; //FUNDAMENTAL
    const objeto = { campo1, campo2 };

    //VALIDAR EL ÍNDICE
    if (indice == ""){
        lista.push(objeto); //CON PUSH AGREGAMOS EL OBJETO
    } else {
        lista[indice] = objeto;
    }

    //UPDATE LOCAL STORAGE CON EL localStorage.setItem
    localStorage.setItem("miLista", JSON.stringify(lista));

    //LIMPIAR LOS CAMPOS
    limpiar();
    //MOSTRAR LOS DATOS
    mostrar();
}


//2.- FUNCIÓN LIMPIAR (simplemente puro document.getElementById con .value e igualarlo a "")
function limpiar(){
    document.getElementById("campo1").value = "";
    document.getElementById("campo2").value = "";
    document.getElementById("indice").value = ""; //LIMPIAR EL ÍNDICE
}


//3.- FUNCIÓN MOSTRAR
function mostrar(){
    //LEER EL ARREGLO DEL LOCAL STORAGE
    let lista = JSON.parse(localStorage.getItem("miLista")) || []; //FUNDAMENTAL

    //OBTENER EL ELEMENTO DONDE SE MOSTRARÁ LA TABLA
    const tabla = document.getElementById("tabla");

    //LIMPIAR LA TABLA ANTES DE MOSTRAR LOS DATOS
    tabla.innerHTML = "";


    //RECORRER EL ARREGLO Y CREAR FILAS
    lista.forEach((item, i) => { //FUNDAMENTAL USAR forEach
        tabla.innerHTML += `
                <tr>
                    <td>${item.campo1}</td>
                    <td>${item.campo2}</td>
                    <td> //LOS BOTONES DEBEN ESTAR DENTRO DE LA MISMA FILA
                        <button onclick="editar(${i})">Editar</button> //FUNDAMENTAL QUE LA FUNCIÓN EDITAR RECIBA EL ÍNDICE
                        <button onclick="eliminar(${i})">Eliminar</button> //FUNDAMENTAL QUE LA FUNCIÓN ELIMINAR RECIBA EL ÍNDICE
                    </td>
                </tr>
            `;
    });
}


//4.- FUNCIÓN ELIMINAR
function eliminar(indice){
    //LEER EL ARREGLO DEL LOCAL STORAGE
    let lista = JSON.parse(localStorage.getItem("miLista")) || []; //FUNDAMENTAL

    //ELIMINAR EL ÍTEM DEL ARREGLO
    lista.splice(indice, 1); //FUNDAMENTAL USAR splice para eliminar un elemento

    //UPDATE LOCAL STORAGE CON EL localStorage.setItem
    localStorage.setItem("miLista", JSON.stringify(lista));

    //MOSTRAR LOS DATOS
    mostrar();
}


//5.- FUNCIÓN EDITAR
function editar(indice){
    //LEER EL ARREGLO DEL LOCAL STORAGE
    let lista = JSON.parse(localStorage.getItem("miLista")) || []; //FUNDAMENTAL

    //OBTENER EL OBJETO A EDITAR
    const objeto = lista[indice];

    //ASIGNAR LOS VALORES A LOS CAMPOS DEL FORMULARIO
    document.getElementById("campo1").value = objeto.campo1;
    document.getElementById("campo2").value = objeto.campo2;
    document.getElementById("indice").value = indice; //ASIGNAR EL ÍNDICE PARA EDITAR

    //MOSTRAR LOS DATOS
    mostrar();
}

//6.- FUNCIONES EXTRA (operaciones con el localStorage)
function calcularSuma() {
    //LEER EL ARREGLO DEL LOCAL STORAGE
    const lista = JSON.parse(localStorage.getItem("miLista")) || [];
    let suma = 0;
    //RECORRER EL ARREGLO Y CALCULAR LA SUMA
    lista.forEach(item => {
        suma += parseFloat(item.precio || 0);
    });
    alert("Suma total: " + suma.toFixed(2));
}

//7.- window.onload = mostrar;