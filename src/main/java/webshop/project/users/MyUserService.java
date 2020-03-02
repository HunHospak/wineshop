package webshop.project.users;

import com.nimbusds.openid.connect.sdk.AuthenticationRequest;

public interface MyUserService {

  void save(MyUser myUser);

  boolean validateAuthenticationRequest(AuthenticationRequest request);

  MyUser findByUserName(String username);

}
