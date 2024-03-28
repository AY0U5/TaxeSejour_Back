package ma.zs.sejour.ws.converter.etat;

import ma.zs.sejour.bean.core.Etat.EtatTaxeSejour;
import ma.zs.sejour.bean.core.commun.TypeRedevable;
import ma.zs.sejour.ws.dto.commun.TypeRedevableDto;
import ma.zs.sejour.ws.dto.etat.EtatTaxeSejourDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import org.springframework.stereotype.Component;

@Component
public class EtatTaxeSejourConverter extends AbstractConverter<EtatTaxeSejour, EtatTaxeSejourDto> {


    public  EtatTaxeSejourConverter() {
        super(EtatTaxeSejour.class, EtatTaxeSejourDto.class);
        init(true);
    }

    public EtatTaxeSejour toItem(EtatTaxeSejourDto etatTaxeSejourDto){

        EtatTaxeSejour bean = new EtatTaxeSejour();
        bean.setId(etatTaxeSejourDto.getId());
        bean.setLibelle(etatTaxeSejourDto.getLibelle());
        bean.setCode(etatTaxeSejourDto.getCode());
        return bean;}




    public EtatTaxeSejourDto toDto(EtatTaxeSejour bean){

        EtatTaxeSejourDto dto= new EtatTaxeSejourDto();
        bean.setId(bean.getId());
        bean.setLibelle(bean.getLibelle());
        bean.setCode(bean.getCode());
        bean.setSecteur(bean.getSecteur());
        return dto;}

    public void initObject(boolean value) {
    }

}


