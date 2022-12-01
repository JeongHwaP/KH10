//메인 메뉴
//- ContextStore에 있는 login 값을 읽어 상황에 맞는 메뉴를 반환

import {Link} from 'react-router-dom';
import { useContext } from 'react';
import ContextStore from './../../utilities/ContextStore';

const MainMenu = props=>{
    //const store = useContext(ContextStore);//전체
    const {login} = useContext(ContextStore);//login만

    if(login){//로그인 상태일 때의 메뉴
        return (<>
            <div>
                <h1>
                    {/* router에 대한 이동 링크는 Link 태그로 작성한다 */}
                    <Link to='/'>Home</Link>
                    &nbsp;&nbsp;
                    <Link to='/logout'>Logout</Link>
                    &nbsp;&nbsp;
                    <Link to='/mypage'>MyPage</Link>
                    &nbsp;&nbsp;
                    <Link to='/board/list'>Board</Link>
                </h1>
            </div>
        </>);
    }
    else {//로그아웃 상태일 때의 메뉴
        return (<>
            <div>
                <h1>
                    {/* router에 대한 이동 링크는 Link 태그로 작성한다 */}
                    <Link to='/'>Home</Link>
                    &nbsp;&nbsp;
                    <Link to='/login'>Login</Link>
                    &nbsp;&nbsp;
                    <Link to='/board/list'>Board</Link>
                </h1>
            </div>
        </>);
    }

};

export default MainMenu;