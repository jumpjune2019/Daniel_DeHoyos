window.onload = () => {
  //   let hour = 0;
  //   let minute = 0;
  //   let seconds = 0;
  //   let totalSeconds = 0;

  //   let intervalId = null;

  //   function startTimer() {
  //     ++totalSeconds;
  //     hour = Math.floor(totalSeconds / 3600);
  //     minute = Math.floor((totalSeconds - hour * 3600) / 60);
  //     seconds = totalSeconds - (hour * 3600 + minute * 60);

  //     document.getElementById('hour').innerHTML = hour;
  //     document.getElementById('minute').innerHTML = minute;
  //     document.getElementById('second').innerHTML = seconds;
  //   }
  //   document.getElementById('start-btn').addEventListener('click', () => {
  //     intervalId = setInterval(startTimer, 1000);
  //   });

  //   document.getElementById('stop-btn').addEventListener('click', () => {
  //     if (intervalId) clearInterval(intervalId);
  //   });

  //   document.getElementById('reset-btn').addEventListener('click', () => {
  //     totalSeconds = 0;
  //     document.getElementById('hour').innerHTML = '0';
  //     document.getElementById('minute').innerHTML = '0';
  //     document.getElementById('second').innerHTML = '0';
  //   });

  let intervalId = null;

  function checkTime(i) {
    if (i < 10) {
      i = '0' + i;
    }
    return i;
  }

  function startTime() {
    var today = new Date();
    var h = today.getHours();
    var m = today.getMinutes();
    var s = today.getSeconds();

    m = checkTime(m);
    s = checkTime(s);
    document.getElementById('time').innerHTML = h + ':' + m + ':' + s;
    t = setTimeout(function() {
      startTime();
    }, 1000);
  }

  function addDiv() {
    var div = document.createElement('div');
    div.innerHTML = 'Hello';
    document.body.appendChild(div);
  }

  document.getElementById('start-btn').addEventListener('click', () => {
    intervalId = setInterval(startTime, 1000);
  });

  document.getElementById('stop-btn').addEventListener('click', () => {
    clearInterval(intervalId);
  });

  document.getElementById('reset-btn').addEventListener('click', () => {
    totalSeconds = 0;
    document.getElementById('hour').innerHTML = '0';
    document.getElementById('minute').innerHTML = '0';
    document.getElementById('second').innerHTML = '0';
  });

  document.getElementById('add-div').addEventListener('click', addDiv);
};
