
window.addEventListener('load',bind)
function bind(){
    // 포커스가 맞췄을때 색깔이 바뀌는것
document.querySelector('#keyword')
        .addEventListener('focus',()=>{
            const keyword = document.querySelector('#keyword')
            keyword.style.backgroundColor = "yellow";
        })

        // 마우스를 안대고 있을 때 색상
document.querySelector('#keyword')
        .addEventListener('blur',()=>{
            const keyword = document.querySelector('#keyword')
            keyword.style.backgroundColor = "";
        })


        document.querySelector('#keyword')
        .addEventListener('input',()=>{
            const keyword = document.querySelector('#keyword')
            
            const r = parseInt(Math.random() * 256)
            const g = parseInt(Math.random() * 256)
            const b = parseInt(Math.random() * 256)
            const a = Math.random()
            
            keyword.style.backgroundColor = `rgba(${r},${g},${b},${a})`;
        })

        document.querySelector('#site')
        .addEventListener('input', ()=>{

            const value = document.querySelector('#site').value
            console.log('change 이벤트의 value', value)
            const form = document.querySelector('#form')
            if(value == 1){
              form.setAttribute('action', "https://search.naver.com/search.naver")
            }else if(value == 2){
           form.setAttribute('action', "https://www.google.com/search") 
            }
        })

        document.querySelector('#form')
            .addEventListener('submit', (event)=>{
                // 기본기능을 막는다 전송이나 a태그같은 검색을 막는다
                // 여기서는 submit 기능 막음
                event.preventDefault();

              let value = document.querySelector('#keyword').value
              // 스페이스를 지우고 싶다 그러면 트림을 쓰면 된다
              if(value.trim().length < 2){
                alert('검색어는 두 글자 이상입니다')
              }else {
                document.querySelector('#form').submit();
                //submit
              }
            //  console.log(123)
            //  alert(1)
            })

            addEventListener('copy', (event)=>{
                event.preventDefault(); // 복사가 안된다
                alert('복사 금지')
            })

        // 소스를 긁어서 사용할 수 없다
            addEventListener('selectstart', (event)=>{
                event.preventDefault(); // 복사가 안된다
                
            })

            //     // 선택 버튼을 클릭하면 실행됨
            // document.querySelector('.chk_all').addEventListener('change',function(){
            //     // 체크된 항목만 모으기 (.chk:checked 는 선택된 것만 골라줌)
            //     const chekedboxes = document.querySelectorAll('.chk:checked');

            //     // 선택된 토핑을 담을 배열
            //     let selected = [];

            //     // forEach로 선택된 체크박스를 하나씩 꺼냄
            //     chekedboxes.forEach(function(box){
            //         selected.push(box.value);
            //     });

            //     //결과를 화면에 출력 (문자열로 바꿔서 보여줌)
            //     document.querySelector('#result').innerHTML = '토핑 :'  + selected.join(',');
            // });


                    // forEach를 써서 각각 하나씩 에라이로 만들어낸 것
            //     let fruits = ['사과', '바나나', '포도'];
            //     let ultag = document.querySelector('#fruitList');

            //     fruits.forEach(function(item){
            //  // <li>사과</li> 이런 태그 하나씩 만들고 ul에 추가
            //  let li = document.createElement('li'); // <li> 생성
            //         li.textContent = item; // 내용 채우기
            //         ultag.appendChild(li); // ul 붙이기
            //     })

            // 배열 선언
            // let fruits = ['사과','바나나','포도'];
            // let ultag = document.querySelector('#fruitsList');
            // console.log('ultag:', ultag)
            // // for문으로 배열 돌리기
            // for(let i=0; i< 2; i++){
            //     let li = document.createElement( 'li' ); // <li>생성
            //     li.textContent = fruits[i];            // 배열값 채우기
            //     ultag.appendChild(li);                 // <ul> 추가
            // }

            // 콜백을 화살표함수로 하면 this는 여전히 window로 유지됨
            document.querySelector('#parent')
                .addEventListener('click', function(){
                console.log('부모 클릭')

                //event.target : 이벤트
                console.log('event.target : ', event.target)
                // event.currentTarget : 이벤트가 적용된 DOM
                console.log('event.currentTarget : ', event.currentTarget)

                console.log('event.target.parentNode :', event.target.parentNode )
                console.log('event.target.parentNode.parentNode :', event.target.parentNode.parentNode )
            }, true)
            // document.querySelector('#child1')
            //     .addEventListener("click", function(event){

            //         // event.preventDefault()
            //         // 전파 방지
            //         // 부모로 전달되는 이벤트 중지 자식을 누르면 자식부터 나오게하는 코드다
            //         // event.stopPropagation()

            //     console.log('자식1 클릭')
            //     // 이벤트 안에서 this는 
            //     // 더이상 window가 아니다
            //     // js에서 this는 뭔지 알고 있을 때만 사용하세요
                console.log(this)
            //     })
                
                // this : window 객체를 가지고 있다
            console.log( this )
            console.log( this === event.currentTarget)


} 

