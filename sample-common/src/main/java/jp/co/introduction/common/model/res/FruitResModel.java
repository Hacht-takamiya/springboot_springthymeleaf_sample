package jp.co.introduction.common.model.res;

import java.util.List;

import jp.co.introduction.base.model.BaseResModel;
import jp.co.introduction.entity.FruitEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class FruitResModel extends BaseResModel {

  private List<FruitEntity> fruitList;
}
