package jpetstore.domain.logic;

import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jpetstore.dao.AccountDao;
import jpetstore.dao.CategoryDao;
import jpetstore.dao.ItemDao;
import jpetstore.dao.OrderDao;
import jpetstore.dao.ProductDao;
import jpetstore.domain.Account;
import jpetstore.domain.Category;
import jpetstore.domain.Item;
import jpetstore.domain.Order;
import jpetstore.domain.Product;

public class PetStoreImpl implements PetStoreFacade
{

    private AccountDao accountDao;

    private CategoryDao categoryDao;

    private ProductDao productDao;

    private ItemDao itemDao;

    private OrderDao orderDao;

    public void setAccountDao(AccountDao accountDao)
    {
        this.accountDao = accountDao;
    }

    public void setCategoryDao(CategoryDao categoryDao)
    {
        this.categoryDao = categoryDao;
    }

    public void setProductDao(ProductDao productDao)
    {
        this.productDao = productDao;
    }

    public void setItemDao(ItemDao itemDao)
    {
        this.itemDao = itemDao;
    }

    public void setOrderDao(OrderDao orderDao)
    {
        this.orderDao = orderDao;
    }

    public Account getAccount(String username)
    {
        return this.accountDao.getAccount(username);
    }

    public Account getAccount(String username, String password)
    {
        return this.accountDao.getAccount(username, password);
    }

    public void insertAccount(Account account)
    {
        this.accountDao.insertAccount(account);
    }

    public void updateAccount(Account account)
    {
        this.accountDao.updateAccount(account);
    }

    public List getUsernameList()
    {
        return this.accountDao.getUsernameList();
    }

    public List getCategoryList()
    {
        return this.categoryDao.getCategoryList();
    }

    public Category getCategory(String categoryId)
    {
        return this.categoryDao.getCategory(categoryId);
    }

    public List getProductListByCategory(String categoryId)
    {
        return this.productDao.getProductListByCategory(categoryId);
    }

    public List searchProductList(String keywords)
    {
        return this.productDao.searchProductList(keywords);
    }

    public Product getProduct(String productId)
    {
        return this.productDao.getProduct(productId);
    }

    public List getItemListByProduct(String productId)
    {
        return this.itemDao.getItemListByProduct(productId);
    }

    public Item getItem(String itemId)
    {
        return this.itemDao.getItem(itemId);
    }

    public boolean isItemInStock(String itemId)
    {
        return this.itemDao.isItemInStock(itemId);
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
    public void insertOrder(Order order)
    {
        this.orderDao.insertOrder(order);
        //raiseException();
        this.itemDao.updateQuantity(order);
    }

    public Order getOrder(int orderId)
    {
        return this.orderDao.getOrder(orderId);
    }

    public List getOrdersByUsername(String username)
    {
        return this.orderDao.getOrdersByUsername(username);
    }

//    private void raiseException()
//    {
//        throw new RuntimeException("test only!");
//    }
}
