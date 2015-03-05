val a = """An apple a day
          |keeps the doctor away"""
a.stripMargin.split('\n')(1).charAt(0)