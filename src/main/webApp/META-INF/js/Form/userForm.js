function addArchiveCreneaux(id){
    return new Promise (function (resolve,reject){
        $.ajax({
            url : "/Form/UserForm",
            dataType :"JSON",
            type:"POST",
            data : {id:id},
            success : function(data) {
                if (!data.error) {
                    resolve(data);
                } else {
                    reject(data.message);
                }
            }
        });
    });
}