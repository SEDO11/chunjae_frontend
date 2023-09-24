//Navigate == Link+replace
//Navigate : Route로 설정된 특정 페이지로 이동
import { Navigate } from 'react-router-dom';

const MyPage = ( isLoggedIn ) => {
  //const isLoggedIn = false;

  if (!isLoggedIn) {
    return <Navigate to="/login" replace={true} />;
  }

  return (
    <div>
      <h2>마이 페이지</h2>
    </div>
  );
};

export default MyPage;