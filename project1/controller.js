var Controller = function() {
  var addButtonClickEvent = function(textTrigger, event) {
    //code added by Daniel De Hoyos line 5 and if statement on line 8
    //**line 5** is a cross browser compatibility catch so that the unicode for the button will be recognized across various browsers
    var key = event.which || event.keyCode;
    var model = this;
    var value = textTrigger.value.trim();
    // ** Line 9 ** triggers the add item functionality if the enter button is pressed or if the add 'button' is pressed
    if (key === 13 || event.target.type === 'button') {
      if (value.length) {
        if (model.notDuplicate(value)) {
          model.Add(value);
          textTrigger.value = null;
        } else {
          alert('Duplicate Value');
        }
      }
    }
  };

  var addEnterKeyPressEvent = function(textTrigger, event) {
    var key = event.which || event.keyCode;
    var model = this;
    var value = textTrigger.value.trim();

    if (key === 13) {
      if (value.length) {
        if (model.notDuplicate(value)) {
          model.Add(value);
          textTrigger.value = null;
        } else {
          alert('Duplicate Value');
        }
      }
    }
  };

  var deleteButtonClickEvent = function(event) {
    var model = this;
    if (event.target.type == 'button') {
      model.Delete(event.target.value);
    }
  };

  var constructor = function() {
    var scopeEl;
    var model;
    var view;

    this.init = function(el, m, v) {
      scopeEl = el;
      model = m;
      view = v;
      model.setScope(el);
      model.setView(view);
      model.registerWidget(view.listView());
      model.registerWidget(view.summaryView());
      model.refreshWidgets(view, model);

      var addButton = view.triggerField().getButtonInstance(el);
      var textTrigger = view.triggerField().getTextInstance(el);
      // //code added by Daniel De Hoyos on 27/6/19
      // //this is the new event created to handle the enter button being pressed
      // var enterEvent = view.triggerField().getTextInstance(el);

      addButton.addEventListener(
        'click',
        addButtonClickEvent.bind(model, textTrigger)
      );

      //code added by Daniel De Hoyos on 27/6/19 @ 11:00am
      //This is the enter event that is triggered by a 'keypress' on the enter button on the keyboard
      enterEvent.addEventListener(
        'keypress',
        addEnterKeyPressEvent.bind(model, textTrigger)
      );

      var listViewEl = scopeEl.getElementsByClassName('listWrapper')[0];
      listViewEl.addEventListener('click', deleteButtonClickEvent.bind(model));
    };
  };

  return new constructor();
};
