
function update(){
const checkBox1=document.querySelector('#Checkbox1')
const checkBox2=document.querySelector('#Checkbox2')
const checkBox3=document.querySelector('#Checkbox3')
const checkBox4=document.querySelector('#Checkbox4')
const checkBox5=document.querySelector('#Checkbox5')
// let alert1=false;
// let alert2=false;
// let alert3=false;
// let alert4=false;
// let alert5=false;

const progress=document.querySelector('#progress')
const score=document.querySelector('#userActivity')
let w=20;
let s=0;
function updateValue(s,width){
    score.textContent=`${s}/`;
    progress.style.width=w+"%";
}
if (checkBox1.checked == true)
{
    s++;
    updateValue(s,w);
    w+=20;
}
if (checkBox2.checked == true)
{
    s++;
    updateValue(s,w);
    w+=20;
}
if (checkBox3.checked == true)
{
    s++;
    updateValue(s,w);
    w+=20;
}
if (checkBox4.checked == true)
{
    s++;
    updateValue(s,w);
    w+=20;
}
if (checkBox5.checked == true)
{
    s++;
    updateValue(s,w);
    w+=20;
}
if(checkBox5.checked != true && checkBox4.checked != true && checkBox3.checked != true && checkBox2.checked != true && checkBox1.checked != true)
{
  s=0;
  w=0;
  updateValue(s,w);
}
var p = "";
if(s==1)
{
  p = "Heyy you made the first move. Way to go:)";
}
if(s==2 || s==3)
  p = "Doing Well!!!";
if(s==4)
p = "Close enough.. You can do it!!";
if(s==5)
p = "You made it!!";
if (s > 0){
  let x = Math.floor((Math.random() * 10) + 1);
  if (x==1){
    p += "\n" + "Genius is one percent inspiration and ninety-nine percent perspiration.";
  }
  if (x==2){
    p += "\n" + "Difficulties increase the nearer we get to the goal.";
  }
  if (x==3){
    p += "\n" + "Well begun is half done.";
  }
  if (x==4){
    p += "\n" + "To lead people walk behind them.";
  }
  if (x==5){
    p += "\n" + "Having nothing, nothing can he lose.";
  }
  if (x==6){
    p += "\n" + "Bite off more than you can chew, then chew it.";
  }
  if (x==7){
    p += "\n" + "Once you choose hope, anythings possible.";
  }
  if (x==8){
    p += "\n" + "Don't wait. The time will never be just right.";
  }
  if (x==9){
    p += "\n" + "Without courage, wisdom bears no fruit.";
  }
  if (x==10){
    p += "\n" + "Every new day is another chance to change your life.";
  }
  alert(p);

}
}