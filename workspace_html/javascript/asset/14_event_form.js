
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

                                                                                                 

}