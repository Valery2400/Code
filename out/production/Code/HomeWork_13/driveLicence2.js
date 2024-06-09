function getDriveLicense(success,failure){
    if (Math.random()>0.1){
        success("Успех получения водительского удостоверения")
    }else{
        failure("Неудача получения водительского удостоверения")
    }
}
function success(result){
    console.log(`Успешно завершено с результатом ${result}`)
}
function failure(error){
    console.log(`Неудача завершена с ошибкой ${error}`)
}

getDriveLicense(success,failure);