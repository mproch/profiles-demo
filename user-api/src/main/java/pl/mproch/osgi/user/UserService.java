package pl.mproch.osgi.user;

import javax.jws.soap.SOAPBinding;

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface UserService {

    User loadById(Long id);

}
