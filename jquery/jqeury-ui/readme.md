# jquery ui
[jquery ui 링크](https://jqueryui.com/demos/)

# 주소

[Accordion](https://jqueryui.com/accordion/#collapsible)

# Demos

## Accordion

> faq 같은거 만들때 사용하면 좋을 것 같다.

![이미지](./readme/demos.png)

# 테마

## Download

> 띄어쓰기 되있는건 하이픈(-) 써서 붙혀라

![이미지](./readme/theme.png)

## 코드 테마 변경

> base 부분을 다른걸로 바꾸면 된다.

![이미지](./readme/code.png)

# Autocomplete

[Autocomplete](https://jqueryui.com/autocomplete/)

# Button

[Button](https://jqueryui.com/button/)

# Checkboxradio

[Checkboxradio](https://jqueryui.com/checkboxradio/)

# Datepicker

[Datepicker](https://jqueryui.com/datepicker/)

# dialog

[Dialog](https://jqueryui.com/dialog/)

# menu

[Menu](https://jqueryui.com/menu/)

## easing(가속, 감속 효과)

```
linear
swing
easeInQuad
easeOutQuad
easeInOutQuad
easeInCubic
easeOutCubic
easeInOutCubic
easeInQuart
easeOutQuart
easeInOutQuart
easeInQuint
easeOutQuint
easeInOutQuint
easeInExpo
easeOutExpo
easeInOutExpo
easeInSine
easeOutSine
easeInOutSine
easeInCirc
easeOutCirc
easeInOutCirc
easeInElastic
easeOutElastic
easeInOutElastic
easeInBack
easeOutBack
easeInOutBack
easeInBounce
easeOutBounce
easeInOutBounce
```

## dialog위젯에 버튼 추가와 여러 가지 옵션들
```javascript
appendTo : 현재 문서의 다른 부분에 있는 요소를 대화상자에 추가
Selector : 대화상자에 추가할 요소 선택
ex: $( ".selector" ).dialog({ appendTo: "#someElem" });


autoOpen : 자동으로 실행할지 지정 
Boolean : (true 또는 false)

ex: $( ".selector" ).dialog({ autoOpen: false });
getter일 경우
var autoOpen = $( ".selector" ).dialog( "option", "autoOpen" );

setter일 경우
$( ".selector" ).dialog( "option", "autoOpen", false );


buttons : 다이얼로그 위젯에 생성할 버튼과 이벤트 리스너를 지정 ( submit, reset, cancle )
Object : submit, reset, cancle
Array : each문에 의해 버튼이 자동으로 여러 개 반복 생성될 경우 배열 이름
ex : $( ".selector" ).dialog({ buttons: [ { text: "Ok", click: function() { $( this ).dialog( "close" ); } } ] });
getter일 경우
var buttons = $( ".selector" ).dialog( "option", "buttons" );
setter일 경우
$( ".selector" ).dialog( "option", "buttons", [ { text: "Ok", click: function() { $( this ).dialog( "close" ); } } ] );


closeOnEscape : esc키를 눌렀을 경우 대화상자 종료를 하도록 할 것인지 지정
Boolean : (true 또는 false)
ex:$( ".selector" ).dialog({ closeOnEscape: false });
getter일 경우
var closeOnEscape = $( ".selector" ).dialog( "option", "closeOnEscape" );
setter일 경우
$( ".selector" ).dialog( "option", "closeOnEscape", false );


closeText : 닫기 버튼에 대한 텍스트 제공
String : 문자열
ex : $( ".selector" ).dialog({ closeText: "hide" });
getter일 경우
var closeText = $( ".selector" ).dialog( "option", "closeText" );
setter일 경우
$( ".selector" ).dialog( "option", "closeText", "hide" );


dialogClass : 다이얼로그 테마 클래스 지정
String : 다이얼로그에 지정할 테마 클래스의 이름
ex : $( ".selector" ).dialog({ dialogClass: "alert" });
getter일 경우
var dialogClass = $( ".selector" ).dialog( "option", "dialogClass" );
setter일 경우
$( ".selector" ).dialog( "option", "dialogClass", "alert" );


draggable : 다이얼로그 대화상자의 드래그 여부 지정
Boolean : (true 또는 false)		
ex : $( ".selector" ).dialog({ draggable: false });
getter일 경우
var draggable = $( ".selector" ).dialog( "option", "draggable" );
setter일 경우
$( ".selector" ).dialog( "option", "draggable", false );


height : 다이얼로그 대화상자의 높이 지정
Number or String : px단위 숫자만 기재 또는 auto 문자열
ex : $( ".selector" ).dialog({ height: 400 });
getter일 경우
var height = $( ".selector" ).dialog( "option", "height" );
setter일 경우
$( ".selector" ).dialog( "option", "height", 400 );


hide : 다이얼로그 대화상자의 숨기고자할 경우의 옵션, 액션 또는 이펙트 지정
    
Boolean, Number of effect duration, String of effect type, Object of animation options
Boolean : true, false
Number of effect duration or delay or easing: ms단위 숫자만
String of effect type : blind, bounce, clip, drop, explode, fade, fold, puff, pulsate,
            scale, shake, size, slide, transfer
Object of animation options : effect, delay, duration, and easing

ex : $( ".selector" ).dialog({ hide: { effect: "explode", duration: 1000 } });
getter일 경우
var hide = $( ".selector" ).dialog( "option", "hide" );
setter일 경우
$( ".selector" ).dialog( "option", "hide", { effect: "explode", duration: 1000 } );


maxHeight : 늘릴 수 있는 대화상자의 최대 높이 지정
Number : px단위 숫자만 기재
ex : $( ".selector" ).dialog({ maxHeight: 600 });
getter일 경우
var maxHeight = $( ".selector" ).dialog( "option", "maxHeight" );
setter일 경우
$( ".selector" ).dialog( "option", "maxHeight", 600 );


maxWidth : 늘릴 수 있는 대화상자의 최대 폭 지정
Number : px단위 숫자만 기재
ex : $( ".selector" ).dialog({ maxWidth: 600 });
getter일 경우
var maxWidth = $( ".selector" ).dialog( "option", "maxWidth" );
setter일 경우
$( ".selector" ).dialog( "option", "maxWidth", 600 );


minHeight : 줄일 수 있는 대화상자의 최소 높이 지정
Number : px단위 숫자만 기재
ex : $( ".selector" ).dialog({ minHeight: 200 });
getter일 경우
var minHeight = $( ".selector" ).dialog( "option", "minHeight" );
setter일 경우
$( ".selector" ).dialog( "option", "minHeight", 200 );

minWidth : 줄일 수 있는 대화상자의 최소 폭 지정
Number : px단위 숫자만 기재
ex : $( ".selector" ).dialog({ minWidth: 200 });
getter일 경우
var minWidth = $( ".selector" ).dialog( "option", "minWidth" );
setter일 경우
$( ".selector" ).dialog( "option", "minWidth", 200 );


modal : 모달 대화상자(대화상자외에 다른 부분을 조작할 수 없는 대화상자)의 사용 유무
Boolean : (true 또는 false)		
ex : $( ".selector" ).dialog({ modal: true });
getter일 경우
var modal = $( ".selector" ).dialog( "option", "modal" );
setter일 경우
$( ".selector" ).dialog( "option", "modal", true );


position : 대화상자의 위치 지정
my: {"center", at: "center", of: window }
ex : $( ".selector" ).dialog({ position: { my: "left top", at: "left bottom", of: button } });
getter일 경우
var position = $( ".selector" ).dialog( "option", "position" );
setter일 경우
$( ".selector" ).dialog( "option", "position", { my: "left top", at: "left bottom", of: button } );


resizable : 대화상자의 크기 조절 가능 유무
Boolean : (true 또는 false)		
ex : $( ".selector" ).dialog({ resizable: false });
getter일 경우
var resizable = $( ".selector" ).dialog( "option", "resizable" );
setter일 경우
$( ".selector" ).dialog( "option", "resizable", false );


show : 대화상자가 보여질 때 실행할 이펙트 또는 모션 지정
Boolean, Number of effect duration, String of effect type, Object of animation options
Boolean : true, false
Number of effect duration or delay or easing: ms단위 숫자만
String of effect type : blind, bounce, clip, drop, explode, fade, fold, puff, pulsate,
            scale, shake, size, slide, transfer
Object of animation options : effect, delay, duration, and easing

ex : $( ".selector" ).dialog({ show: { effect: "blind", duration: 800 } });
getter일 경우
var show = $( ".selector" ).dialog( "option", "show" );
setter일 경우
$( ".selector" ).dialog( "option", "show", { effect: "blind", duration: 800 } );


title : 대화상자의 제목부분에 입력할 텍스트
String : 다이얼로그에 지정할 타이틀바의 내용
ex : $( ".selector" ).dialog({ title: "Dialog Title" });
getter일 경우
var title = $( ".selector" ).dialog( "option", "title" );
setter일 경우
$( ".selector" ).dialog( "option", "title", "Dialog Title" );


width : 대화상자의 폭 크기 지정
Number : px단위 숫자만 기재
ex : $( ".selector" ).dialog({ width: 500 });
getter일 경우
var width = $( ".selector" ).dialog( "option", "width" );
setter일 경우
$( ".selector" ).dialog( "option", "width", 500 );


사용할 수 있는 메서드
close() : 대화상자 닫기
destroy() : 대화상자 제거
disable() : 대화상자 사용 불가능 상태로
enable() : 대화상자 사용 가능 상태로
instance() :
isOpen() : 대화상자가 열려 있는지 확인
moveToTop() : 
open() : 대화상자 열기
option() : 
widget() : 

ex)
$( ".selector" ).dialog( "close" );
$( ".selector" ).dialog( "destroy" );
$( ".selector" ).dialog( "instance" );
var isOpen = $( ".selector" ).dialog( "isOpen" );
$( ".selector" ).dialog( "moveToTop" );
$( ".selector" ).dialog( "open" );
var options = $( ".selector" ).dialog( "option" );
var widget = $( ".selector" ).dialog( "widget" );


사용할 수 있는 이벤트 메서드
create() : 대화상자가 생성될 때
beforeClose() : 대화상자가 닫히기 전에
open() : 대화상자가 열릴 때
focus() : 대화상자에 커서나 포인터가 갔을 때
close() : 대화상자가 닫힐 때
resize() : 대화상자의 크기가 바뀔 때
drag() : 대화상자가 드래그 될 때   

ex) beforeClose() 이벤트 메서드
$( ".selector" ).dialog({
    beforeClose: function( event, ui ) {}
});
또는
$( ".selector" ).on( "dialogbeforeclose", function( event, ui ) {} );

ex) close() 이벤트 메서드
$( ".selector" ).dialog({
    close: function( event, ui ) {}
});
또는
$( ".selector" ).on( "dialogclose", function( event, ui ) {} );

ex) create() 이벤트 메서드
$( ".selector" ).dialog({
    create: function( event, ui ) {}
});
또는
$( ".selector" ).on( "dialogcreate", function( event, ui ) {} );

ex) drag() 이벤트 메서드
$( ".selector" ).dialog({
    drag: function( event, ui ) {}
});
또는
$( ".selector" ).on( "dialogdrag", function( event, ui ) {} );

ex) focus() 이벤트 메서드	
$( ".selector" ).dialog({
    focus: function( event, ui ) {}
});
또는
$( ".selector" ).on( "dialogfocus", function( event, ui ) {} );

ex) open() 이벤트 메서드
$( ".selector" ).dialog({
    open: function( event, ui ) {}
});
또는
$( ".selector" ).on( "dialogopen", function( event, ui ) {} );

ex) resize() 이벤트 메서드
$( ".selector" ).dialog({
    resize: function( event, ui ) {}
});
또는
$( ".selector" ).on( "dialogresize", function( event, ui ) {} );
```