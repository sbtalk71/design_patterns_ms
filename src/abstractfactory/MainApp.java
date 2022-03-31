package abstractfactory;

class MainApp

  {

   public static void main(String[] args)

    {

      // Create and run the African animal world

      ContinentFactory africa = new AfricaFactory();

      AnimalWorld world = new AnimalWorld(africa);

      world.RunFoodChain();

 

      // Create and run the American animal world

      ContinentFactory america = new AmericaFactory();

      world = new AnimalWorld(america);

      world.RunFoodChain();

 
    }

  }

 
abstract class ContinentFactory

  {

    public abstract Herbivore CreateHerbivore();

    public abstract Carnivore CreateCarnivore();

  }

 

  /// <summary>

  /// The 'ConcreteFactory1' class

  /// </summary>

  class AfricaFactory extends ContinentFactory

  {

    public  Herbivore CreateHerbivore()

    {

      return new Wildebeest();

    }

    public  Carnivore CreateCarnivore()

    {

      return new Lion();

    }

  }

 

  /// <summary>

  /// The 'ConcreteFactory2' class

  /// </summary>

  class AmericaFactory extends ContinentFactory

  {

    public  Herbivore CreateHerbivore()

    {

      return new Bison();

    }

    public  Carnivore CreateCarnivore()

    {

      return new Wolf();

    }

  }

 

  /// <summary>

  /// The 'AbstractProductA' abstract class

  /// </summary>

  abstract class Herbivore

  {

  }

 

  /// <summary>

  /// The 'AbstractProductB' abstract class

  /// </summary>

  abstract class Carnivore

  {

    public abstract void Eat(Herbivore h);

  }

 

  /// <summary>

  /// The 'ProductA1' class

  /// </summary>

  class Wildebeest extends Herbivore

  {

  }

 

  /// <summary>

  /// The 'ProductB1' class

  /// </summary>

  class Lion extends Carnivore

  {

    public  void Eat(Herbivore h)

    {

      // Eat Wildebeest

      System.out.println(this.getClass().getName() +" eats " + h.getClass().getName());

    }

  }

 

  /// <summary>

  /// The 'ProductA2' class

  /// </summary>

  class Bison extends Herbivore

  {

  }

 

  /// <summary>

  /// The 'ProductB2' class

  /// </summary>

  class Wolf extends Carnivore

  {

    public  void Eat(Herbivore h)

    {

      // Eat Bison

      System.out.println(this.getClass().getName() +" eats " + h.getClass().getName());

    }

  }

 

  /// <summary>

  /// The 'Client' class

  /// </summary>

  class AnimalWorld

  {

    private Herbivore _herbivore;

    private Carnivore _carnivore;

 

    // Constructor

    public AnimalWorld(ContinentFactory factory)

    {

      _carnivore = factory.CreateCarnivore();

      _herbivore = factory.CreateHerbivore();

    }

 

    public void RunFoodChain()

    {

      _carnivore.Eat(_herbivore);

    }

  }