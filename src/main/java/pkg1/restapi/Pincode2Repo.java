package pkg1.restapi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Pincode2Repo extends JpaRepository<Pincode2Entity, Long>{
	@Query(value="select * from pincodes where pincode=:pin",nativeQuery=true)
	public List<Pincode2Entity> findPincode(@Param(value = "pin") int pin);

}