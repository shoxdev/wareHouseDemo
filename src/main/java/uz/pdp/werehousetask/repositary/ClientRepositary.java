package uz.pdp.werehousetask.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.werehousetask.entity.Attachment;
import uz.pdp.werehousetask.entity.Client;
import uz.pdp.werehousetask.projection.ClientProjection;

import java.util.UUID;
@RepositoryRestResource(path = "client",collectionResourceRel = "list",excerptProjection = ClientProjection.class)
public interface ClientRepositary extends JpaRepository<Client, UUID> {

}
