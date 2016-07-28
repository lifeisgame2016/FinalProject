$(document).ready(function () {
    $('#calc2').click(function () {
        $.ajax({
            url:"math/factorial?number=" + $('#field2').val()
        }).success(function (data) {
            $('#field2').val(data.message);
        }).error(function (error) {
           var response = $.parseJSON(error.responseText);
            console.log(response.message)
            $('#field2').val(response.message)
        })
        
    })

    $('#calc1').click(function () {
        $.ajax({
            url:"math/fibonacci?number=" + $('#field1').val()
        }).success(function (data) {
            $('#field1').val(data.message);
        }).error(function (error) {
            var response = $.parseJSON(error.responseText);
            console.log(response.message)
            $('#field1').val(response.message)
        })

    })
    
})
