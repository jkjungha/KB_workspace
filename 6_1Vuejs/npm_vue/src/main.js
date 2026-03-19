//index.html 파일에서 main.js파일을 불러오면 뷰app의 코드가 실행된다.
//뷰app을 초기화 하고 구성하는 역할을 하는 파일
//vue 패키지에 createApp함수를 가져온다.
//createApp함수는 뷰 애플리케이션의 인스턴스를 생성하는 역할을 한다.(단 하나의 인스턴스를 가짐)
import { createApp } from 'vue';
import App from './App.vue';

createApp(App).mount('#app');
