package UserManagement;

import java.util.Optional;

public interface UserRepository {
	Optional<UserEntity> FindByAge(int age);

	void saveUser(UserEntity userType);

	void deleteByAge(int age);

}
