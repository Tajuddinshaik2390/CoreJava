package UserManagement;

import java.util.Optional;

public class UserRepositoryImpl  implements UserRepository{

	@Override
	public Optional<UserEntity> FindByAge(int age) {
		
		
		return Optional.empty();
	}

	@Override
	public void saveUser(UserEntity userType) {
		
		
	}

	@Override
	public void deleteByAge(int age) {
		
	}
	

}
