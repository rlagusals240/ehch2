//  console.log('hello js')

window.addEventListener('load', init)

//  window.onload = init;
//  window.onload = init();// 이건 널이 나온다

function init() {
    const msg = document.querySelector('#conso')
    console.log('msg :', msg)

    const game = document.querySelector('#game') //움직일 대상인 #game 요소 가져옴
    game.style.left = "10px" // 왼쪽 위치를 10px로 설정
    game.style.top = "10px"  // 위쪽 위치도 10px로 설정

    bind(); // 이벤트들을 연결하는 함수 호출
}
// 이벤트들을 연결하는 함수
function bind() {
    const msg = document.querySelector('#conso'); // 같이 msg선언을 해줘야한다
    const btn1 = document.querySelector('#btn1'); // 버튼1 선택

    btn1.onclick = function () { // 버튼을 누를때마다 뭐가 생긴다
        msg.innerHTML += '<br>버튼1 클릭'
    }
    // 버튼 클릭 시 메시지
    const btn2 = document.querySelector('#btn2');
    // 애드 이벤트리스트는 계속 추가 시키는것
    btn2.addEventListener('click', function () {
        btn2.onclick = function () {
            msg.innerHTML += '<br>버튼2 클릭'
        }
    })

    const login = document.querySelector('#login')
    login.addEventListener('click', function () {
        const id = document.querySelector('#id').value;
        const pw = document.querySelector('#pw').value;
        console.log('id :', id, id == "")
        if (id == "") {
            msg.innerHTML += '<br>아이디는 필수입니다'
        } else if (pw == "") {
            msg.innerHTML += '<br>비밀번호는 필수입니다'
        } else {
            msg.innerHTML += ` <br>아이디 : ${id}, 비밀번호 : ${pw}`;
        }
    })

    window.addEventListener("resize", function () {
        console.log("resize")
        console.log(window.innerWidth)
    })

    window.addEventListener('scroll', function () {
        console.log('scroll')
        console.log('scrollTop', document.documentElement.scrollTop)
        // document.documentElement.scrollTop = 140
    })
    // 키를 눌렀을 때 
    // document.querySelector('#id').addEventListener('keydown', function(){
    //     console.log('아아아아아')
    // });
    document.querySelector('#id').addEventListener('keyup', function (event) {
        // console.log('아아아아아')
        console.log(event)
        console.log(event.keyCode);
        if (event.keyCode == 13) {
            console.log('엔터!!')
            document.querySelector('#pw').focus();
        }
    });
    document.querySelector('#pw').addEventListener('keyup', function (event) {
        if (event.keyCode == 13) {
            document.querySelector('#login').click();
        }

    });

    document.querySelector('body').addEventListener('keydown', function (event) {
        console.log(event.keyCode) // 언젠간 없어질 keyCode이다
        const game = document.querySelector('#game')
        console.log(game.style.left)
        // 왼쪽
        // (game.computedStyleMap.top)
        if (event.keyCode == 37) {
            game.style.left = (parseInt(game.style.left) - 10) + 'px'
        } else if (event.keyCode == 38) {
            game.style.top = (parseInt(game.style.top) - 10) + 'px'
        
        }else if (event.keyCode == 39) {
           game.style.left = (parseInt(game.style.left) + 10) + 'px'
            
        } else if (event.keyCode == 40) {
            game.style.top = (parseInt(game.style.top) + 10) + 'px'
        }
    })



    // 스크롤을 부드럽게 해준다
    //    document.querySelector('#top').addEventListener('click', function(){
    //     window.scrollTo(
    //         {
    //             top: 0,
    //             behavior: 'smooth'
    //         }
   
    //     )
    //    })

}

function btnClick() {
    //1 메시지 출력용 요소 선택(id="conso"인 요소)
    const msg = document.querySelector('#conso')
    // 2 메시지창에 로그를 남김
    msg.innerHTML += '<br>btnClick 실행'

    // 로그인 버튼을 눌렀을 때
    // 아이디와 비밀번호가 비어있지 않다면
    //      아이디, 비밀번호 출력
    //  하나라도 안썼다면 
    //     아이디는 필수입니다 또는 비밀번호는 필수입니다 출력

    // 3 아래 기능은 "부드럽게 스크롤 위로 올라가는 효과"를 직접 만든 것

    // 현재 스크롤 위치부터 0까지 10px씩 줄이면서 반복
    for (let i = document.documentElement.scrollTop; i >= 0; i -= 10) {
       // 시간 계산: 아래로 내려올수록 늦게 실행되도록 시간 차이를 줌
        let time = (200 - i) * 10;
        // 일정 시간 뒤에 실행될 함수 설정
        setTimeout(function () {
            // i값과 시간값 콘솔에 출력
            console.log('i :', i, 'time :', time)
            // 문서의 스크롤 위치를 i로 설정 (점점 위로 올림)
            document.documentElement.scrollTop = i;
        }, time)
    }
}




