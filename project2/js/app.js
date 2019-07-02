// old timer function

// function timer() {
//   var btn = document.getElementById('controlButton');
//   var state = 'start';
//   var display = document.getElementById('elapsedTime');
//   var timerId;
//   console.log('fired from app.js in timer');
//   function start() {
//     var count = 0;

//     function showTime() {
//       count++;
//       display.innerHTML = count;
//     }

//     timerId = setInterval(showTime, 1000);
//   }

//   function end() {
//     display.innerHTML = 'End!';
//     clearInterval(timerId);
//   }

//   if (state == 'start') {
//     state = 'end';
//     btn.innerHTML = 'End';
//     start();
//   } else {
//     state = 'start';
//     btn.innerHTML = 'Start';
//     end();
//   }
// }

function allowDrop(ev) {
  ev.preventDefault();
}

function drag(ev) {
  ev.dataTransfer.setData('text', ev.target.id);
}

function drop(ev) {
  ev.preventDefault();
  var data = ev.dataTransfer.getData('text');
  ev.target.appendChild(document.getElementById(data));
}

//Timer in hh:mm:ss
function formatTime(seconds) {
  var h = Math.floor(seconds / 3600),
    m = Math.floor(seconds / 60) % 60,
    s = seconds % 60;
  if (h < 10) h = '0' + h;
  if (m < 10) h = '0' + m;
  if (s < 10) h = '0' + s;
  return h + ':' + m + ':' + s;
}

var counter = 0;
var counter;
function startTimer() {
  counter = setInterval(timer, 1000);
}

function timer() {
  count++;
  document.getElementById('.elapsedTime').innerHTML = formatTime(count);
}

//Randomize the order of an array
// function shuffle(array) {
//   array.sort(() => Math.random() - 0.5);
// }
