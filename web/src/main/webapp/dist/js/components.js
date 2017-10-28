/**
 * A component of echarts panel
 * with loading from remote
 * with event handling
 */

/*日期格式*/
function formatDate(time) {
    if (!time) return '';
    return (new Date(time)).format("YYYY-MM-DD HH:mm:ss");
}

function formatCurrency(num) {
    num = num.toString().replace(/\$|\,/g,'');
    if(isNaN(num)){
        num = "0";
    }
    var sign = (num == (num = Math.abs(num)));
    num = Math.floor(num*100+0.50000000001);
    var cents = num%100;
    num = Math.floor(num/100).toString();
    if(cents<10){
        cents = "0" + cents;
    }
    for (var i = 0; i < Math.floor((num.length-(1+i))/3); i++){
        num = num.substring(0,num.length-(4*i+3))+','+
            num.substring(num.length-(4*i+3));
    }
    return (((sign)?'':'-') + num + '.' + cents);
}

/***************************gateway common js begin************************************/
function showBusinessType(value) {
    var html;
    switch (value) {
        case "01":
            html = '<font color="green">Pay</font>';
            break;
        case "02":
            html = '<font color="#ffd700">Pay Charge Off</font>';
            break;
        case "03":
            html = '<font color="#a52a2a">Pay Query</font>';
            break;
        default:
            html = '<font color="red">undefined</font>';
            break;
    }
    return html;
}

function showGatewayType(value) {
    var html;
    switch (value){
        case "01":
            html='<font color="green">front gateway</font>';
            break;
        case "02":
            html='<font color="blue">post gateway</font>';
            break;
        case "03":
            html='<font color="yellow">other gateway</font>';
            break;
        default:
            html = '<font color="red">undefined</font>';
            break;
    }
}

/****************************gateway common js end***********************************/
