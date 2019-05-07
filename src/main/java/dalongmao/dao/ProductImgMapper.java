package dalongmao.dao;

import dalongmao.entity.ProductImg;

public interface ProductImgMapper {
    int deleteByPrimaryKey(Integer productImgId);

    int insert(ProductImg record);

    int insertSelective(ProductImg record);

    ProductImg selectByPrimaryKey(Integer productImgId);

    int updateByPrimaryKeySelective(ProductImg record);

    int updateByPrimaryKey(ProductImg record);
}