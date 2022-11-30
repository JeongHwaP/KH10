import './App.css';
import MainPage from './components/page/MainPage';
import MainFooter from './components/template/MainFooter';
import MainHeader from './components/template/MainHeader';
import MainMenu from './components/template/MainMenu';

const App = ()=>{
  return (
    <>
      {/* 헤더, 메뉴, 본문, 푸터 등으로 컴포넌트를 분할해야 함 */}
      <MainHeader/>
      <MainMenu/>
      <MainPage/>
      <MainFooter/>
    </>
  );
}

export default App;
