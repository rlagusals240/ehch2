let view // 선언을 해도되고 안해도된다 짜피 호이스팅이 된다
window.onload = function(){
      view = document.querySelector("#view");

      const cursor = document.querySelector('#cursor')
      cursor.style.top = '-1000px';
      cursor.style.left = '-1000px';


      bind();
}
function bind(){
    view.innerHTML = '안녕?'

    document.querySelector('#mouse')
    .addEventListener('mousedown',function(evt){
        view.innerHTML = 'mousedown 발생<br>' + view.innerHTML

        console.log(evt)
        // offset : Dom의 좌상단 기준
        // page : 스크롤에 관계 없이 문서 좌상단 기준
        // client : 지금 보이는 화면 좌상단 기준
        view.innerHTML = ` 
        event.offsetX : ${evt.offsetX}<br> event.offsetY : ${evt.offsetY}<br>
        event.pageX : ${evt.pageX}<br> event.pageY : ${evt.pageY}<br>
        event.clientX : ${evt.clientX}<br> event.clientY : ${evt.clientY}<br>
        <br>
        ${view.innerHTML}
        `
        document.querySelector('#mouse').style.backgroundColor = 'blue'
    })
    // 
    document.querySelector('#mouse')
    .addEventListener('mouseup',function(){
        view.innerHTML = 'mouseup 발생<br>' + view.innerHTML
})
// 마우스오버는 마우스를 갖다 대기만해도 나온다 호버같은 쉐키다
    document.querySelector('#mouse')
    .addEventListener('mouseover',function(){
        view.innerHTML = 'mouseover 발생<br>' + view.innerHTML

        document.querySelector('#mouse').style.backgroundColor = 'red'
})

// 범위가 벗어났을때 기능이 작동한다
    document.querySelector('#mouse')
    .addEventListener('mouseout',function(){
        view.innerHTML = 'mouseout 발생<br>' + view.innerHTML
        document.querySelector('#mouse').style.backgroundColor = 'yellow'
})

        document.querySelector('body')
            .addEventListener('mousemove', function(evt){
                const cursor = document.getElementById('cursor');

                //cursor


                // 플러스를 줄 경우 클릭이 된다 그림말고
                cursor.style.top = evt.pageY + 'px';
                cursor.style.left = evt.pageX + 'px';
            })

            let v = false
            document.querySelector('body')
                .add

//     document.querySelector('#mouse')
//     .addEventListener('mousemove',function(){
//         view.innerHTML += 'mousemove 발생<br>' + view.innerHTML
// });


}

