## _Monoids and Semigroup Rings_
---
Given a commutative unital ring _R_ we ask for which semigroups _G_ the semigroup ring _R_[_G_] is in fact a monoid.
### _Motivation_
---

If the semigroup _G_ is commutative then the above question is fully understood. For this we need the following

#### _Definition_

Let _G_ be a semigroup and _H_ be a subset of _G_. We say that **_H_ is reflexive** if for every element _g_ in _G_ there are elements _h_ and _h'_ in _H_ such that 

* _hg = g_ 

* _gh' = g_

Now we have the following 

#### _Theorem_

Let _R_ be a commutative unital ring and _G_ a commutative semigroup. The following statements are equivalent:

* _R_[_G_] is a monoid
* There exists a finite subset _H_ of _G_ such that H is reflexive

##### _Proof_ 
Some linear algebra.

### _Main Project_
---

As we can see above we are only interested in the non-commutative case. There are some other statements we will not consider:
* It is easy to see that if _G_ has a right-neutral element and a left-neutral element then _G_ is a monoid so _R_[_G_] is obviously a monoid
* If _G_ has two (or more) different right-neutral elements then they will be right-neutral in _R_[_G_] ass well. We can follow that _R_[_G_] is **not** unital because then the two elements would coincide
* The same holds for left-neutral elements

The only cases which are not trivial are
* _G_ has exactly one right-neutral element and zero left-neutral elements
* _G_ has exactly one left-neutral element and zero right-neutral elements
* _G_ has zero right-neutral and zero left-neutral elements

To make things more easy we will only look at finite semigroups _G_.

### _Prerequisites_
---
The content is Java code. So you need IDEs such as eclipse.

### _Authors_
---
* Roman Haak