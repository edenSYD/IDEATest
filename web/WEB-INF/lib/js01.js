//输出语句
document.writeln("<h1>this is a heading</h1>")
document.writeln("<p>this is a paragraph</p>")

function myFunction() {
    //html dom
    var x = document.getElementById("demo");
   x.innerText = "Hello javascript!";
   x.style.color = "#ff0000";
}
//控制灯泡
function changeImage() {
    var element = document.getElementById("myimage");
    if (element.src.match("eg_bulbon.gif")){
        element.src = "eg_bulboff.gif";
    }else {
        element.src = "eg_bulbon.gif";
    }
}

//判断是不是数字
function isNUmber() {
    var x = document.getElementById("isnumber");
    if (x == "" || isNaN(x)){
        alert("not number");
    }
}