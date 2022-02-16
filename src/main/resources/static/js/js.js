document.addEventListener('DOMContentLoaded', function () {

    const but = document.querySelector('#objtest');
    but.addEventListener('mousedown', function() {
        const request = new XMLHttpRequest();
        const url = "/objtest";

        const id_product = "id";
        const qty_product = "qty";
        const params = "id_product=" + id_product + "&qty_product=" + qty_product;

        // Здесь нужно указать в каком формате мы будем принимать данные вот и все	отличие
        // request.responseType = "json";
        request.open("POST", url, true);
        request.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        request.addEventListener("readystatechange", function() {
            if (request.readyState === 4 && request.status === 200) {
                // let obj = request.response;// так всё выводит сплошным текстом
                //const list = eval("(" + request.responseText + ")");// Обязательно обрабатывать!!!
            }
        });
        request.send(params);
    });



}, false);
